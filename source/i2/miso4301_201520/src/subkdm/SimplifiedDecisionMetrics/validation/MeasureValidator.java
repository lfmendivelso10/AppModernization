/**
 *
 * $Id$
 */
package subkdm.SimplifiedDecisionMetrics.validation;

import org.eclipse.emf.common.util.EList;

import subkdm.SimplifiedDecisionMetrics.Measurement;

/**
 * A sample validator interface for {@link subkdm.SimplifiedDecisionMetrics.Measure}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MeasureValidator {
	boolean validate();

	boolean validateMeasurements(EList<Measurement> value);
	boolean validateName(String value);
	boolean validateDescription(String value);
}
