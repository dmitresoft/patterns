package com.sukhovilin.patterns.gof.creational.FactoryMethod.realworld;

import java.util.List;

/**
 * A 'ConcreteCreator' class
 */
class ReportDocument extends AbstractDocument {
	// Factory Method implementation
	@Override
	public void createPages() {
		List<AbstractPage> pages = getPages();
		pages.add(new IntroductionPage());
		pages.add(new ResultsPage());
		pages.add(new ConclusionPage());
		pages.add(new SummaryPage());
		pages.add(new BibliographyPage());
	}

}