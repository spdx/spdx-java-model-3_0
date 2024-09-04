/**
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) 2024 Source Auditor Inc.
 */
package org.spdx.library.model.v3_0_1;

import org.spdx.core.IModelCopyManager;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.TypedValue;
import org.spdx.storage.IModelStore;

/**
 * @author Gary O'Neall
 * 
 * Copy manager for testing
 *
 */
public class MockCopyManager implements IModelCopyManager {

	@Override
	public TypedValue copy(IModelStore toStore, IModelStore fromStore,
			String sourceUri, String toSpecVersion,
			String toNamespace) throws InvalidSPDXAnalysisException {
		// Mock - not implemented
		return null;
	}

	@Override
	public void copy(IModelStore toStore, String toObjectUri,
			IModelStore fromStore, String fromObjectUri,
			String toSpecVersion, String toNamespace)
			throws InvalidSPDXAnalysisException {
		// Mock - not implemented

	}

	@Override
	public String getCopiedObjectUri(IModelStore fromStore,
			String fromObjectUri, IModelStore toStore) {
		// Mock - not implemented
		return null;
	}

	@Override
	public String putCopiedId(IModelStore fromStore, String fromObjectUri,
			IModelStore toStore, String toObjectUri) {
		// Mock - not implemented
		return null;
	}

}
