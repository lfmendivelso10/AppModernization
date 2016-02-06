/**
 *
 * $Id$
 */
package subkdm.kdmObjects.validation;

import org.eclipse.emf.common.util.EList;

import subkdm.kdmObjects.CodeModel;

/**
 * A sample validator interface for {@link subkdm.kdmObjects.Segment}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SegmentValidator {
	boolean validate();

	boolean validateModel(EList<CodeModel> value);
	boolean validateName(String value);
}