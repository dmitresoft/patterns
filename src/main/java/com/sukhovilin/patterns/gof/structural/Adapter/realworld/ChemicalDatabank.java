package com.sukhovilin.patterns.gof.structural.Adapter.realworld;

/**
 * The 'Adaptee' class
 */
class ChemicalDatabank {
	// The databank 'legacy API'
	public float GetCriticalPoint(String compound, String point) {
		// Melting Point
		if (point == "M") {
			String val = compound.toLowerCase();
			if ("water".equals(val)) {
				return 0.0f;
			} else if ("benzene".equals(val)) {
				return 5.5f;
			} else if ("ethanol".equals(val)) {
				return -114.1f;
			} else {
				return 0f;
			}
		}
		// Boiling Point
		else {
			String val = compound.toLowerCase();
			if ("water".equals(val)) {
				return 100.0f;
			} else if ("benzene".equals(val)) {
				return 80.1f;
			} else if ("ethanol".equals(val)) {
				return 78.3f;
			} else {
				return 0f;
			}
		}
	}

	public String GetMolecularStructure(String compound) {
		String val = compound.toLowerCase();
		if ("water".equals(val)) {
			return "H20";
		} else if ("benzene".equals(val)) {
			return "C6H6";
		} else if ("ethanol".equals(val)) {
			return "C2H5OH";
		} else {
			return "";
		}
	}

	public double GetMolecularWeight(String compound) {
		String val = compound.toLowerCase();
		if ("water".equals(val)) {
			return 18.015;
		} else if ("benzene".equals(val)) {
			return 78.1134;
		} else if ("ethanol".equals(val)) {
			return 46.0688;
		} else {
			return 0d;
		}
	}
}