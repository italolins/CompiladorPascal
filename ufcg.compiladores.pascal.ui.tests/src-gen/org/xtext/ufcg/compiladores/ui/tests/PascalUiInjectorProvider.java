/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ufcg.compiladores.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import ufcg.compiladores.pascal.ui.internal.PascalActivator;

public class PascalUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PascalActivator.getInstance().getInjector("org.xtext.ufcg.compiladores.Pascal");
	}

}
