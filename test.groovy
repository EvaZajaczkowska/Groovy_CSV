@Grab('com.xlson.groovycsv:groovycsv:1.3')
import static com.xlson.groovycsv.CsvParser.parseCsv

def csv = '''"Related To","Assigned","Subject","Date","Task/Event Record Type","Type of Interaction","Comments","Related to Campaign","Name","Business Unit","Status","Priority","Created By","Created Date","Last Modified By","Last Modified Date"
"00276576","Johannes","Risk Assessment","20/01/2021","Standard Task","","","","Test Contact","MMS","Completed","Normal","Johannes Hantschean Gnong","19/01/2021","Johannes Hantschean Gnong","19/01/2021"
"00276578","Andras","Risk analysis","20/01/2021","Standard Task","","","","","MMS","Completed","Normal","Andras","19/01/2021","Johannes","19/01/2021"
'''

def data = parseCsv(csv)
for(line in data) {
    log.error("$line.Subject $line.Date") 
}
