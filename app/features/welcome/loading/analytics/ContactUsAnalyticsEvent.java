package com.forsale.app.features.welcome.loading.analytics;

import com.forsale.app.analytics.base.AnalyticsParameters;
import g00.l;
import kotlin.jvm.internal.o;
import p001if.a;
import u9.c;
import wz.p;
/* compiled from: ContactUsAnalyticsEvent.kt */
/* loaded from: classes2.dex */
public final class ContactUsAnalyticsEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f37377a;

    /* renamed from: b  reason: collision with root package name */
    private final a f37378b;

    public ContactUsAnalyticsEvent(String phoneNumber) {
        o.i(phoneNumber, "phoneNumber");
        this.f37377a = phoneNumber;
        this.f37378b = a.f58204a;
    }

    @Override // u9.c
    public Object a(zz.a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.welcome.loading.analytics.ContactUsAnalyticsEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                String str;
                o.i(invoke, "$this$invoke");
                str = ContactUsAnalyticsEvent.this.f37377a;
                invoke.c("PhoneNumber", str);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParameters analyticsParameters) {
                b(analyticsParameters);
                return p.f75480a;
            }
        });
    }

    @Override // u9.c
    /* renamed from: c */
    public a getKey() {
        return this.f37378b;
    }
}
