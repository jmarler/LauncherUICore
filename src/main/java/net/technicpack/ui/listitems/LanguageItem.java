/*
 * This file is part of Technic UI Core.
 * Copyright ©2015 Syndicate, LLC
 *
 * Technic UI Core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Technic UI Core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * as well as a copy of the GNU Lesser General Public License,
 * along with Technic UI Core.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.technicpack.ui.listitems;

import net.technicpack.ui.lang.ResourceLoader;

public class LanguageItem {
    private String langCode;
    private String text;
    private ResourceLoader languageResources;

    public LanguageItem(String code, String defaultText, ResourceLoader languageResources) {
        this.langCode = code;
        this.text = defaultText;
        this.languageResources = languageResources;
    }

    public String getLangCode() { return langCode; }
    public String toString() { return text; }
    public ResourceLoader getLanguageResources() { return languageResources; }
}
