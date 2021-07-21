# mysql相关

- 导出表字段和结构
```
select t.TABLE_NAME,tb.TABLE_COMMENT, t.COLUMN_NAME , t.COLUMN_TYPE ,
t.DATA_TYPE,
 t.CHARACTER_MAXIMUM_LENGTH as 长度,
t.COLUMN_COMMENT,t.TABLE_SCHEMA
from information_schema.`COLUMNS` t 
INNER JOIN  information_schema.`TABLES` tb on tb.TABLE_NAME =t.TABLE_NAME
where t.TABLE_SCHEMA ='important'

```