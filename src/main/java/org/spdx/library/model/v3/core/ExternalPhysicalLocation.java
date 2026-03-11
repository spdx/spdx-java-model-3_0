/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.core;

import org.spdx.storage.NullModelStore;
import org.spdx.core.IndividualUriValue;
import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3.ModelObjectV3;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.extension.Extension;

/**
 * This is an external representation of PhysicalLocation - nothing can be set and properties returned
 * are not valid
 *
 */
public class ExternalPhysicalLocation extends PhysicalLocation  implements IndividualUriValue {

	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	Collection<String> geographicPointLocations = Collections.emptyList();

	/**
	 * @param objectUri URI or anonymous ID for the PhysicalLocation
	 * @throws InvalidSPDXAnalysisException when unable to create the PhysicalLocation
	 */
	public ExternalPhysicalLocation(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalPhysicalLocation
	 */
	public ExternalPhysicalLocation(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the PhysicalLocation from the builder - used in the builder class
	 * @param builder Builder to create the PhysicalLocation from
	 * @throws InvalidSPDXAnalysisException when unable to create the PhysicalLocation
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalPhysicalLocation(PhysicalLocationBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
	}
	
	@Override
	public boolean isExternal() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.IndividualUriValue#getIndividualURI()
	 */
	@Override
	public String getIndividualURI() {
		return getObjectUri();
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Core.ExternalPhysicalLocation";
	}
	
	// Getters and Setters
	public Collection<IntegrityMethod> getVerifiedUsings() {
		return verifiedUsings;
	}
	public Collection<ExternalRef> getExternalRefs() {
		return externalRefs;
	}
	public Collection<ExternalIdentifier> getExternalIdentifiers() {
		return externalIdentifiers;
	}
	public Collection<String> getGeographicPointLocations() {
		return geographicPointLocations;
	}
	
		/**
	 * @return the extension
	 */
	 @SuppressWarnings("unchecked")
	public Optional<Extension> getExtension() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param extension the extension to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setExtension(@Nullable Extension extension) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the creationInfo
	 */
	public @Nullable CreationInfo getCreationInfo() throws InvalidSPDXAnalysisException {
		return null;
	}
		
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the countyCode
	 */
	public Optional<String> getCountyCode() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param countyCode the countyCode to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setCountyCode(@Nullable String countyCode) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the description
	 */
	public Optional<String> getDescription() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the postOfficeBoxNumber
	 */
	public Optional<String> getPostOfficeBoxNumber() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param postOfficeBoxNumber the postOfficeBoxNumber to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setPostOfficeBoxNumber(@Nullable String postOfficeBoxNumber) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the country
	 */
	public Optional<String> getCountry() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param country the country to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setCountry(@Nullable String country) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the postalCode
	 */
	public Optional<String> getPostalCode() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param postalCode the postalCode to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setPostalCode(@Nullable String postalCode) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the postalName
	 */
	public Optional<String> getPostalName() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param postalName the postalName to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setPostalName(@Nullable String postalName) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the comment
	 */
	public Optional<String> getComment() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the provinceStateCode
	 */
	public Optional<String> getProvinceStateCode() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param provinceStateCode the provinceStateCode to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setProvinceStateCode(@Nullable String provinceStateCode) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the city
	 */
	public Optional<String> getCity() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param city the city to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setCity(@Nullable String city) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the streetAddress
	 */
	public Optional<String> getStreetAddress() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param streetAddress the streetAddress to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setStreetAddress(@Nullable String streetAddress) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the locationTime
	 */
	public Optional<String> getLocationTime() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param locationTime the locationTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setLocationTime(@Nullable String locationTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the name
	 */
	public Optional<String> getName() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the summary
	 */
	public Optional<String> getSummary() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalLocation setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	
	
	@Override
	public String toString() {
				return super.toString();
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		return new ArrayList<>();
	}
}
