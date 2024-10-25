package com.forsale.app.datalayer.network.serializers;

import com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;
/* compiled from: VerticalTabDeserializer.kt */
/* loaded from: classes2.dex */
public final class VerticalTabDeserializer implements i<VerticalSectionsTabs> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.i
    public VerticalSectionsTabs deserialize(j json, Type typeOfT, h context) {
        o.i(json, "json");
        o.i(typeOfT, "typeOfT");
        o.i(context, "context");
        try {
            VerticalSectionsTabs.a aVar = VerticalSectionsTabs.Companion;
            String e11 = json.e();
            o.h(e11, "getAsString(...)");
            VerticalSectionsTabs a11 = aVar.a(e11);
            return a11 == null ? VerticalSectionsTabs.TOP_USER_ADS : a11;
        } catch (Exception unused) {
            return VerticalSectionsTabs.TOP_USER_ADS;
        }
    }
}
