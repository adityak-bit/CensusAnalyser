package com.cg;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.CSVReader;

public class CensusAnalyser {

	public int loadIndiaCensusData(String indiaCensusCsvFilePath) throws CensusAnalyserException, IOException {
		try{
			Reader reader = Files.newBufferedReader(Paths.get(indiaCensusCsvFilePath));
			CsvToBeanBuilder<IndiaCensusCSV> csvToBeanBuilder = new CsvToBeanBuilder<>(reader);
			csvToBeanBuilder.withType(IndiaCensusCSV.class);
			csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
			CsvToBean<IndiaCensusCSV> csvToBean = csvToBeanBuilder.build();
			Iterator<IndiaCensusCSV> censusCSVIterator = csvToBean.iterator();
			int numOfEntries = 0;
			while(censusCSVIterator.hasNext()) {
				numOfEntries++;
				IndiaCensusCSV censusData = censusCSVIterator.next();
			}
			return numOfEntries;
		}catch(IllegalStateException e) {
			throw new CensusAnalyserException(e.getMessage(),
					CensusAnalyserException.ExceptionType.UNABLE_TO_PARSE);
	}
}
}