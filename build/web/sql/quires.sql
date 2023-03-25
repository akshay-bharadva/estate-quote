-- ! Select State Of INDIA
select GEO_ID, GEO_NAME from GEO_MAST
where PAR_GEO_ID = 52 and GEO_LVL_ID = 3
order by GEO_NAME;

-- ! Select Cities Of Selected State
select c.GEO_ID, c.GEO_NAME from GEO_MAST s
join GEO_MAST c
on s.GEO_ID = c.PAR_GEO_ID
where c.GEO_LVL_ID = 4 and s.GEO_ID = [STATE_NAME_FROM_ABOVE]
order by c.GEO_NAME;

-- ! Function to Get GEO_NAME from GEO_MAST
DELIMITER //
CREATE FUNCTION FNX_GET_STATE_NAME(V_ID INT) RETURNS text DETERMINISTIC
BEGIN
 DECLARE V_NAME text;
  select NAME into V_NAME from states where ID = V_ID;
  RETURN V_NAME;
END 
// DELIMITER ;

DELIMITER //
CREATE FUNCTION FNX_GET_CITY_NAME(V_ID INT) RETURNS text DETERMINISTIC
BEGIN
 DECLARE V_NAME text;
  select NAME into V_NAME from cities where ID = V_ID;
  RETURN V_NAME;
END 
// DELIMITER ;

select FNX_GET_GEO_NAME_DEMO(78);

-- ! Delete Null Records 
delete from inquiry_demo where inquiryid like 'null' or inquiryid = null or inquiryid ='';
delete from inquiry_demo where firstname like 'null' or firstname = null or firstname ='';
delete from inquiry_demo where lastname like 'null' or lastname = null or lastname ='';
delete from inquiry_demo where address like 'null' or address = null or address ='';
delete from inquiry_demo where state like 'null' or state = null or state ='';
delete from inquiry_demo where city like 'null' or city = null or city ='';
delete from inquiry_demo where pincode like 'null' or pincode = null or pincode ='';
delete from inquiry_demo where carpetarea like 'null' or carpetarea = null or carpetarea ='';
delete from inquiry_demo where year like 'null' or year = null or year ='';
delete from inquiry_demo where roof like 'null' or roof = null or roof ='';
delete from inquiry_demo where floor like 'null' or floor = null or floor ='';
delete from inquiry_demo where firesafety like 'null' or firesafety = null or firesafety ='';
delete from inquiry_demo where dob = null or dob = '' or dob like 'null';

create table NJCT_INQUIRY_DEMO(
  inquiryid varchar(36) primary key,
  firstname varchar(30),
  lastname varchar(30),
  dob varchar(11),
  address varchar(100),
  state varchar(30),
  city varchar(30),
  pincode varchar(10),
  carpetarea int(11),
  roof enum('WOODEN','RCC'),
  floor enum('WOODEN','TILE'),
  firesafety bit(1),
  year int(11),
  offerid varchar(36),
  basecoverage int,
  basepremium int,
  maxcoverage int,
  mincoverage int
);

create table NJCT_OFFER_DEMO(
  offerid varchar(36),
  coverage int,
  premium int, 
  inquiryid varchar(36),
  constraint fk_inquiryid foreign key(inquiryid) references NJCT_INQUIRY_DEMO(inquiryid)
);


create trigger UPDATE_OFFER_ID_ON_NJCT_INQUIRY_DEMO 
after insert on NJCT_OFFER_DEMO
for each row
	UPDATE NJCT_INQUIRY_DEMO
    SET offerid = NEW.offerid
    WHERE inquiryid = NEW.inquiryid;
    
