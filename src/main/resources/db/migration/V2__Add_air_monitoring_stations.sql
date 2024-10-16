CREATE SEQUENCE "SEQ_AIR_MONITORING_STATION_ID"
    START WITH 1
    NOCACHE
    NOCYCLE;

CREATE TABLE air_monitoring_stations (
    "ID" INTEGER DEFAULT SEQ_AIR_MONITORING_STATION_ID.nextval,
    "COUNTRY" VARCHAR2(50),
    "CITY" VARCHAR2(50)
    );

ALTER TABLE air_monitoring_stations
ADD CONSTRAINT pk_air_monitoring_stations PRIMARY KEY ("ID");