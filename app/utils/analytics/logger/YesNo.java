package com.forsale.app.utils.analytics.logger;

import com.leanplum.messagetemplates.MessageTemplateConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wi.e;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParameterKey.kt */
/* loaded from: classes3.dex */
public final class YesNo implements e {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ YesNo[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final YesNo YES = new YesNo("YES", 0, MessageTemplateConstants.Values.YES_TEXT);
    public static final YesNo NO = new YesNo("NO", 1, MessageTemplateConstants.Values.NO_TEXT);

    /* compiled from: ParameterKey.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Integer num) {
            YesNo yesNo;
            if (num != null && num.intValue() == 1) {
                yesNo = YesNo.YES;
            } else {
                yesNo = YesNo.NO;
            }
            return yesNo.getValue();
        }
    }

    private static final /* synthetic */ YesNo[] $values() {
        return new YesNo[]{YES, NO};
    }

    static {
        YesNo[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private YesNo(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<YesNo> getEntries() {
        return $ENTRIES;
    }

    public static YesNo valueOf(String str) {
        return (YesNo) Enum.valueOf(YesNo.class, str);
    }

    public static YesNo[] values() {
        return (YesNo[]) $VALUES.clone();
    }

    @Override // wi.e
    public String getValue() {
        return this.value;
    }
}
