package com.navercorp.pinpoint.plugin.bizlog;

import com.navercorp.pinpoint.common.trace.TraceMetadataProvider;
import com.navercorp.pinpoint.common.trace.TraceMetadataSetupContext;

/**
 * @author buxiaoming
 * @since 2020/8/30
 */
public class BizlogMetadataProvider implements TraceMetadataProvider {

    @Override
    public void setup(TraceMetadataSetupContext traceMetadataSetupContext) {
        //设定当前插件的ServiceType，既插件的唯一身份
        traceMetadataSetupContext.addServiceType(BizlogPlugin.BIZLOG_SERVICE_TYPE);
        //设定当前插件要展示的参数
        traceMetadataSetupContext.addAnnotationKey(BizlogPlugin.BIZLOG_ANNOTATION_KEY_INFO);
    }
}
