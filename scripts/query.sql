select * from `spring-batch`.BATCH_JOB_SEQ;
select * from `spring-batch`.BATCH_STEP_EXECUTION_SEQ;
select * from `spring-batch`.BATCH_JOB_EXECUTION_SEQ;

select * from `spring-batch`.BATCH_STEP_EXECUTION_CONTEXT;
select * from `spring-batch`.BATCH_JOB_EXECUTION_CONTEXT;

select * from `spring-batch`.BATCH_JOB_EXECUTION_PARAMS;
select * from `spring-batch`.BATCH_STEP_EXECUTION;
select * from `spring-batch`.BATCH_JOB_EXECUTION;
select * from `spring-batch`.BATCH_JOB_INSTANCE;


call `spring-batch`.clearData();