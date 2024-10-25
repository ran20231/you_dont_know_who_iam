package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.CommonData;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.utils.TypeExtensionsKt;
import eb.k;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: ListingDetailsDescriptionSeeLessClickedEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsDescriptionSeeLessClickedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26338a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26339b;

    /* renamed from: c  reason: collision with root package name */
    private final k f26340c;

    public ListingDetailsDescriptionSeeLessClickedEvent(DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26338a = detailsModel;
        this.f26339b = itemArgs;
        this.f26340c = k.f54768a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsDescriptionSeeLessClickedEvent$createParams$2
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
                detailsModel = ListingDetailsDescriptionSeeLessClickedEvent.this.f26338a;
                itemArgs = ListingDetailsDescriptionSeeLessClickedEvent.this.f26339b;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
                detailsModel2 = ListingDetailsDescriptionSeeLessClickedEvent.this.f26338a;
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
    public k getKey() {
        return this.f26340c;
    }
}
