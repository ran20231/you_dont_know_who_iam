package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ListingMediaType;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.g;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: ListingDetailsMediaOpenedEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsMediaOpenedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26358a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26359b;

    /* renamed from: c  reason: collision with root package name */
    private final ListingMediaType f26360c;

    /* renamed from: d  reason: collision with root package name */
    private final g f26361d;

    public ListingDetailsMediaOpenedEvent(DetailsModel detailsModel, ItemArgs itemArgs, ListingMediaType mediaType) {
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        o.i(mediaType, "mediaType");
        this.f26358a = detailsModel;
        this.f26359b = itemArgs;
        this.f26360c = mediaType;
        this.f26361d = g.f54764a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsMediaOpenedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                ListingMediaType listingMediaType;
                o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsMediaOpenedEvent.this.f26358a;
                itemArgs = ListingDetailsMediaOpenedEvent.this.f26359b;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
                listingMediaType = ListingDetailsMediaOpenedEvent.this.f26360c;
                invoke.c("ListingMediaType", listingMediaType.getValue());
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
    public g getKey() {
        return this.f26361d;
    }
}
