/*********************************************************************
* Copyright (c) 2022 Contributors to the Eclipse Foundation.
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
*   SmartCity Jena - initial
*   Stefan Bischof (bipolis) - initial
*   Sergei Semenkov - initial
**********************************************************************/
package org.eclipse.daanse.sql.dialect.api;

import javax.sql.DataSource;

public interface DialectResolver {

	Dialect resolve(DataSource dataSource);

}
