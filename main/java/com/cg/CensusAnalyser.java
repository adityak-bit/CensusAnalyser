package com.cg;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CensusAnalyser {
	
	public int loadIndiaStateCensusDataCSV(String indiaCensusCsvFilePath) throws CensusAnalyserException {
		try(Reader fileReader = Files.newBufferedReader(Paths.get(INDIA_CENSUS_CSV_FILE_PATH))){
			
		}
	}

}
