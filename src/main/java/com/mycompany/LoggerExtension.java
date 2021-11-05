package com.mycompany;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
@Xml(prefix = "companylogger")
@Extension(name="CompanyLogger")
@Configurations(LoggerConfiguration.class)
public class LoggerExtension {

}
