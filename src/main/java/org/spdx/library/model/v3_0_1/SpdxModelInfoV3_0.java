/**
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) 2024 Source Auditor Inc.
 */
package org.spdx.library.model.v3_0_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.annotation.Nullable;

import org.spdx.core.CoreModelObject;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.ISpdxModelInfo;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ExternalElement;
import org.spdx.storage.IModelStore;

/**
 * GENERATED
 *
 */
public class SpdxModelInfoV3_0 implements ISpdxModelInfo {

	@Override
	public Map<String, Enum<?>> getUriToEnumMap() {
		return SpdxEnumFactory.uriToEnum;
	}

	@Override
	public List<String> getSpecVersions() {
		return Arrays.asList(new String[] {"SPDX-3.0", "3.0.1"});
	}

	@Override
	public CoreModelObject createExternalElement(IModelStore store, String uri,
			IModelCopyManager copyManager, Class<?> typeClass, String specVersion)
			throws InvalidSPDXAnalysisException {
		if (Objects.nonNull(typeClass)) {
			if (!canBeExternal(typeClass)) {
				throw new InvalidSPDXAnalysisException(typeClass.toString() + "Can not be an external type");
			}
			String[] typeParts = SpdxModelClassFactoryV3.SPDX_CLASS_TO_TYPE.get(typeClass).split("\\.");
			String type = typeParts[0] + "." + "External" + typeParts[1];
			return SpdxModelClassFactoryV3.getModelObject(store, uri, type, copyManager, true, "");
		} else {
			return new ExternalElement(uri);
		}
	}

	@Override
	public @Nullable Object uriToIndividual(String uri, @Nullable Class<?> type) {
		return SpdxIndividualFactory.uriToIndividual.get(uri);
	}

	@Override
	public CoreModelObject createModelObject(IModelStore modelStore,
			String objectUri, String type, IModelCopyManager copyManager,
			String specVersion, boolean create, String idPrefix)
			throws InvalidSPDXAnalysisException {
		return SpdxModelClassFactoryV3.getModelObject(modelStore, objectUri, type, copyManager, create, idPrefix);
	}

	@Override
	public Map<String, Class<?>> getTypeToClassMap() {
		return SpdxModelClassFactoryV3.SPDX_TYPE_TO_CLASS_V3;
	}
	
	@Override
	public boolean canBeExternal(Class<?> clazz) {
		return Element.class.isAssignableFrom(clazz);
	}

}
