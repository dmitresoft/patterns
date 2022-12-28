package com.sukhovilin.patterns.gof.creational.FactoryMethod.realworld;

/**
 * A 'ConcreteCreator' class
 */
class ResumeDocument extends AbstractDocument {
	// Factory Method implementation
	@Override
	public void createPages() {
		getPages().add(new SkillsPage());
		getPages().add(new EducationPage());
		getPages().add(new ExperiencePage());
	}
}