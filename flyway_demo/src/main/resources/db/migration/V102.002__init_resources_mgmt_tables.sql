INSERT INTO RESOURCE_ROLE VALUES (1, 'DEV');
INSERT INTO RESOURCE_ROLE VALUES (2, 'QA');

INSERT INTO KNOWLEDGE_LEVEL VALUES (1, 'A', 'EXPERT');
INSERT INTO KNOWLEDGE_LEVEL VALUES (2, 'B', 'GOOD');
INSERT INTO KNOWLEDGE_LEVEL VALUES (3, 'C', 'MIDDLE');
INSERT INTO KNOWLEDGE_LEVEL VALUES (4, 'D', 'LOW');
INSERT INTO KNOWLEDGE_LEVEL VALUES (5, 'E', 'UNKNOWN');

INSERT INTO KNOWLEDGE_DOMAIN VALUES (0, 0, 'EPPIC', 'EPPIC');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (1, 0, 'AT', 'AT');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (2, 0, 'PWP', 'PROVIDER WEB PORTAL');

INSERT INTO KNOWLEDGE_DOMAIN VALUES (3, 0, 'POS', 'POS');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (301, 3, 'POS TERMINAL', 'POS TERMINAL');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (302, 3, 'POS TRANSACTION', 'POS TRANSACTION');

INSERT INTO KNOWLEDGE_DOMAIN VALUES (4, 0, 'IVR', 'IVR');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (401, 4, 'CARDHOLDER IVR', 'CARDHOLDER IVR');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (402, 4, 'PROVIDER IVR', 'PROVIDER IVR');

INSERT INTO KNOWLEDGE_DOMAIN VALUES (5, 0, 'REPORT', 'IREPORT AND PDF REPORT');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (501, 5, 'VA REPORT', 'VA REPORTS ');

INSERT INTO KNOWLEDGE_DOMAIN VALUES (6, 0, 'DATA LOAD ', 'DATA LOAD');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (601, 6, 'WEBSERVICE', 'DATA LOAD');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (602, 6, 'EXTERNAL FILE', 'DATA LOAD');

INSERT INTO KNOWLEDGE_DOMAIN VALUES (7, 0, 'PAYMENT PROCESS', 'PAYMENT PROCESS ');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (701, 7, 'MATCHING PROCESS', 'PAYMENT PROCESS ');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (702, 7, 'PAYMENT CALCULATE PROCESS', 'PAYMENT PROCESS ');

INSERT INTO KNOWLEDGE_DOMAIN VALUES (8, 0, 'SCHEDULE', 'SCHEDULE AND TASK');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (9, 0, 'OUTGOING FILE', 'OUTGOING FILES');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (901, 9, 'ACH', 'ALL STATES');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (902, 9, 'ATTENDANCE SUMMARY FILE', 'VA');
INSERT INTO KNOWLEDGE_DOMAIN VALUES (903, 9, 'ACTIVITY FILE', 'LA ');

-- INSERT INTO SKILLS VALUES (1, );

