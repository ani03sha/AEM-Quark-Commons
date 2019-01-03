package org.redquark.aem.commons.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables = Resource.class)
public class MultifieldModel {

	// Inject the CTA multifield
	@Inject
	@Optional
	public Resource ctaMultifield;
}
