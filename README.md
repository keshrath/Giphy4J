# ExclyCore

ExclyCore is an Java library and can be used as an helper for the Apache POI library. Apache POI is an Java API for Microsoft Documents. ExclyCore improves the extraction of data from Excel files and simplifies the processes of creating a new Excel workbook. 

ExclyCore has two main helper classes.
* XLSXReader
* XLSXWriter

Furthermore it has his own data types.
* ExclyDate
* ExclyDouble
* ExclyInteger
* ExclyLong
* ExclyString

### XLSXReader

The XLSXReader is used to extract data from the Excel file. It can be either extended by another class or directly used via the XLSXReaderUtil class.

#### XLSXReader implementation

```java
	class ReaderImpl extends XLSXReader {
		...
		
		public void extract(Cell currentCell) {
			ExclyString exclyString = readStringCellValue(currentCell);
			ExclyLong exclyLong = readLongCellValue(currentCell);
			ExclyInteger exclyInteger = readIntegerCellValue(currentCell);
			ExclyDouble exclyDouble = readDoubleCellValue(currentCell);
			ExclyDate exclyDate = readDateCellValue(currentCell);
		}
		
		...
	}
```

#### XLSXReaderUtil

```java
	class Reader {
		...
		
		public void extract(Cell currentCell) {
			XLSXReaderUtil reader = new XLSXReaderUtil();
		
			ExclyString exclyString = reader.readStringCellValue(currentCell);
			ExclyLong exclyLong = reader.readLongCellValue(currentCell);
			ExclyInteger exclyInteger = reader.readIntegerCellValue(currentCell);
			ExclyDouble exclyDouble = reader.readDoubleCellValue(currentCell);
			ExclyDate exclyDate = reader.readDateCellValue(currentCell);
		}
		
		...
	}
```

### Excly data types

Every data type has at least to versions. For example the data type ExclyDouble has:

* ExclyDouble 		(regular data type)
* ExclyDoubleError  (error data type)
* ExclyDoubleBlank	(empty data type)

The interface DataType is implemented by every data type. So the following two methods:

* `public void setCell(Cell cell);`
* `public void setCell(Cell cell, CellStyle cellStyle);`

By calling one of this methods the value of the data type is written to the Excel file.

### XLSXWriter

The XLSXWriter is used to create and write a Excel workbooks. There are two available options to create a workbook. The first one is to create a new Excel file and the second one is to extend an existing Excel file.

#### XLSXWriter implementation

```java
	class WriterImpl extends XLSXWriter {
		...
		
		public void create(File outputFile) {
			workbook = createWorkbook(outputFile, false);
			
			...
		
			closeWorkbook();
		}
		
		public void add(File outputFile) {
			workbook = createWorkbook(outputFile, true);
			
			...
		
			closeWorkbook();
		}
		
		...
	}
```

#### XLSXWriterUtil

```java
	class Writer {
		...
		
		private XLSXWriterUtil writer = new XLSXWriterUtil();
		
		public void create(File outputFile) {
			workbook = writer.createWorkbook(outputFile, false);
			
			...
		
			writer.closeWorkbook();
		}
		
		public void add(File outputFile) {
			workbook = writer.createWorkbook(outputFile, true);
			
			...
		
			writer.closeWorkbook();
		}
		
		...
	}
```

## Download ExclyCore

ExclyCore can either be downloaded as a JAR file or embedded as Maven dependency. 

### Manual Install

Download JAR from [here](https://github.com/mukprojects/ExclyCore/tree/master/distribution).

### Maven

```xml
	<dependency>
		<groupId>at.mukprojects</groupId>
		<artifactId>exclycore</artifactId>
		<version>1.0.0</version>
	</dependency>
```

