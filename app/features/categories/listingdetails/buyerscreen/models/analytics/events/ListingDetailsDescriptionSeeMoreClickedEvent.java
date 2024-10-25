package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.CommonData;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.utils.TypeExtensionsKt;
import eb.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: ListingDetailsDescriptionSeeMoreClickedEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsDescriptionSeeMoreClickedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26342a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26343b;

    /* renamed from: c  reason: collision with root package name */
    private final l f26344c;

    public ListingDetailsDescriptionSeeMoreClickedEvent(DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26342a = detailsModel;
        this.f26343b = itemArgs;
        this.f26344c = l.f54769a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new g00.l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsDescriptionSeeMoreClickedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                DetailsModel detailsModel2;
                CommonData d11;
                String o11;
                o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsDescriptionSeeMoreClickedEvent.this.f26342a;
                itemArgs = ListingDetailsDescriptionSeeMoreClickedEvent.this.f26343b;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
                detailsModel2 = ListingDetailsDescriptionSeeMoreClickedEvent.this.f26342a;
                if (detailsModel2 != null && (d11 = detailsModel2.d()) != null && (o11 = d11.o()) != null) {
                    invoke.c("WordsCount", Integer.valueOf(TypeExtensionsKt.W0(o11)));
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParameters analyticsParameters) {
                b(analyticsParameters);
                return p.f75480a;
            }
        });
    }

    @Override // u9.c
    /* renamed from: d */
    public l getKey() {
        return this.f26344c;
    }
}
