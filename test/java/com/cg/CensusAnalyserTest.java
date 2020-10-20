package com.cg;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.cg.CensusAnalyser;
import com.cg.CensusAnalyserException;

public class CensusAnalyserTest {

	private static final String INDIA_CENSUS_CSV_FILE_PATH = "./src/test/resources/IndiaStateCensusData.csv";
	private static final String WRONG_CSV_FILE_PATH = "./src/main/resources/IndiaStateCensusData.csv";
	@Test
	public void givenIndianCensusCSVFileCheckReturnsCorrectRecords() throws IOException {
		try{
			CensusAnalyser censusAnalyser = new CensusAnalyser();
		    int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
		    Assert.assertEquals(29, numOfRecords);
		}catch(CensusAnalyserException e) {}
	}
}
