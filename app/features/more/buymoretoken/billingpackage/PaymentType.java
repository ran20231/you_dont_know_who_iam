package com.forsale.app.features.more.buymoretoken.billingpackage;

import com.leanplum.messagetemplates.MessageTemplateConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m00.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentType.kt */
/* loaded from: classes2.dex */
public final class PaymentType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ PaymentType[] $VALUES;
    public static final a Companion;
    @up.c("in_app")
    public static final PaymentType IN_APP = new PaymentType("IN_APP", 0, "in_app");
    @up.c("url")
    public static final PaymentType URL = new PaymentType(MessageTemplateConstants.Args.URL, 1, "url");
    private static final Map<String, PaymentType> map;
    private final String value;

    /* compiled from: PaymentType.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final /* synthetic */ PaymentType[] $values() {
        return new PaymentType[]{IN_APP, URL};
    }

    static {
        int e11;
        int d11;
        PaymentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        PaymentType[] values = values();
        e11 = i0.e(values.length);
        d11 = o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (PaymentType paymentType : values) {
            linkedHashMap.put(paymentType.value, paymentType);
        }
        map = linkedHashMap;
    }

    private PaymentType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<PaymentType> getEntries() {
        return $ENTRIES;
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
