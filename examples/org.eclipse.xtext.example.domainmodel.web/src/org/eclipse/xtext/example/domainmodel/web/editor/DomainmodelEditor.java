/**
 * @Generated by DSLFORGE
 */
package org.eclipse.xtext.example.domainmodel.web.editor;

import org.eclipse.rap.json.JsonObject;

public class DomainmodelEditor extends AbstractDomainmodelEditor {

	static final String EDITOR_ID = "org.eclipse.xtext.example.domainmodel.web.editor";

	public DomainmodelEditor() {
		super();
	}

	@Override
	protected void handleTextChanged(JsonObject object) {
		super.handleTextChanged(object);
		//enable validation on text change
		validateResource();
	}
}
