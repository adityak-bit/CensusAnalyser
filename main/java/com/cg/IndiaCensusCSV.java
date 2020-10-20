package com.cg;

import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {

	@CsvBindByName
	String state;
	@CsvBindByName
	long population;
	@CsvBindByName
	long areaInSqKm;
	@CsvBindByName
	int densityPerSqKm;
	
	@Override
	public String toString() {
		return "CsvToBeanBuilder [state=" + state + ", population=" + population + ", areaInSqKm=" + areaInSqKm
				+ ", densityPerSqKm=" + densityPerSqKm + "]";
	}
}
