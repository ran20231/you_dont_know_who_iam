package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.r;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: ListingDetailsWhatsAppDirectedEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsWhatsAppDirectedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f26397a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailsModel f26398b;

    /* renamed from: c  reason: collision with root package name */
    private final ItemArgs f26399c;

    /* renamed from: d  reason: collision with root package name */
    private final r f26400d;

    public ListingDetailsWhatsAppDirectedEvent(String phoneNumber, DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(phoneNumber, "phoneNumber");
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26397a = phoneNumber;
        this.f26398b = detailsModel;
        this.f26399c = itemArgs;
        this.f26400d = r.f54775a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsWhatsAppDirectedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                String str;
                o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsWhatsAppDirectedEvent.this.f26398b;
                itemArgs = ListingDetailsWhatsAppDirectedEvent.this.f26399c;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
                str = ListingDetailsWhatsAppDirectedEvent.this.f26397a;
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
    /* renamed from: e */
    public r getKey() {
        return this.f26400d;
    }
}
