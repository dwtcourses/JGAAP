package com.jgaap.classifiers;

import weka.classifiers.Classifier;
import weka.classifiers.meta.ClassificationViaRegression;

public class WEKALeastMedSq extends WEKAAnalysis {

	@Override
	public String displayName() {
		return "WEKA Least Median Squared";
	}

	@Override
	public String tooltipText() {
		return "Least Median Squared Linear Regression, Courtesy of WEKA";
	}

	@Override
	public boolean showInGUI() {
		return true;
	}
	
	public Classifier getClassifier() {
		ClassificationViaRegression c = new ClassificationViaRegression();
		c.setClassifier(new weka.classifiers.functions.LeastMedSq());
		return (Classifier)c;
	}

}