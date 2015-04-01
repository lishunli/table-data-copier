## What do ##
copy table's data from one database to another database(same table schema)
## Environment ##
JDK 1.6+ <br>
Only support oracle and mysql Driver DB.<br>
<h2>Options</h2>
Please put the configuration file(config.properties) same with an executable file directory<br>
<h3>Oracle</h3>
<pre><code>### config.properties ###<br>
### you can put config.properties into folder which containing the exe or jar file, or manual input. ###<br>
fromDbDriver=oracle.jdbc.driver.OracleDriver<br>
fromDbUrl=jdbc:oracle:thin:@${ip}:${port}:${sid}<br>
fromDbUsername=username<br>
fromDbPassword=password<br>
toDbDriver=oracle.jdbc.driver.OracleDriver<br>
toDbUrl=jdbc:oracle:thin:@${ip}:${port}:${sid}<br>
toDbUsername=username<br>
toDbPassword=password<br>
criteria=table name or criteria<br>
<br>
#when occurred error,must open log file.<br>
openLogFile=false<br>
#delay Time To Open Log(ms)<br>
delayTime=5000<br>
<br>
#Is Delete Original Data<br>
deleteOriginalData=false<br>
<br>
#Abort When Abnormal Copy<br>
abort=false<br>
</code></pre>

<h3>Note</h3>
support connect by Oracle Service name. in this case, those URL will tuning as:<br>
jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=on)(ADDRESS=(PROTOCOL=TCP)(HOST=${ip})(PORT=${port}))(CONNECT_DATA=(SERVICE_NAME=${service_name})))<br>
and please according to your own environment to reconfigure @${ip},${port},${sid},${service_name} or others<br>
<br>
<h3>Mysql</h3>
<pre><code>### Ditto ###<br>
fromDbDriver=com.mysql.jdbc.Driver<br>
fromDbUrl=jdbc:mysql://@${ip}:${port}/${db}<br>
fromDbUsername=username<br>
fromDbPassword=password<br>
toDbDriver=com.mysql.jdbc.Driver<br>
toDbUrl=jdbc:mysql://@${ip}:${port}/${db}<br>
toDbUsername=username<br>
toDbPassword=password<br>
criteria=table name or criteria<br>
<br>
#when occurred error,must open log file.<br>
openLogFile=false<br>
#delay Time To Open Log(ms)<br>
delayTime=5000<br>
<br>
#Is Delete Original Data<br>
deleteOriginalData=false<br>
<br>
#Abort When Abnormal Copy<br>
abort=false<br>
</code></pre>
<h2>Support</h2>
if you have any questions,welcome to contact me with Email(lishunli.me@gmail.com) or create issues with <a href='http://code.google.com/p/table-data-copier/issues/list'>http://code.google.com/p/table-data-copier/issues/list</a> ,i will reply you as soon as possible.<br><br>
<a href='https://me.alipay.com/lishunli'><img src='http://usc.googlecode.com/files/2ec58971.png' /></a>