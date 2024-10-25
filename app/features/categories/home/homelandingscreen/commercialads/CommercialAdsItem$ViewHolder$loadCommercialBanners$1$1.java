package com.forsale.app.features.categories.home.homelandingscreen.commercialads;

import android.content.Context;
import com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsItem;
import com.forsale.app.utils.z;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: CommercialAdsItem.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1", f = "CommercialAdsItem.kt", l = {129, 143}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f24138a;

    /* renamed from: b  reason: collision with root package name */
    Object f24139b;

    /* renamed from: c  reason: collision with root package name */
    Object f24140c;

    /* renamed from: d  reason: collision with root package name */
    Object f24141d;

    /* renamed from: e  reason: collision with root package name */
    Object f24142e;

    /* renamed from: f  reason: collision with root package name */
    int f24143f;

    /* renamed from: g  reason: collision with root package name */
    private /* synthetic */ Object f24144g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ List<List<Integer>> f24145h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ CommercialAdsItem.ViewHolder f24146i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Context f24147j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ CommercialAdsViewModel f24148x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ ArrayList<NativeCustomFormatAd> f24149y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommercialAdsItem.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1$2", f = "CommercialAdsItem.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24155a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommercialAdsViewModel f24156b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList<NativeCustomFormatAd> f24157c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CommercialAdsViewModel commercialAdsViewModel, ArrayList<NativeCustomFormatAd> arrayList, a<? super AnonymousClass2> aVar) {
            super(2, aVar);
            this.f24156b = commercialAdsViewModel;
            this.f24157c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass2(this.f24156b, this.f24157c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f24155a == 0) {
                f.b(obj);
                this.f24156b.i(new z.b(this.f24157c));
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1(List<? extends List<Integer>> list, CommercialAdsItem.ViewHolder viewHolder, Context context, CommercialAdsViewModel commercialAdsViewModel, ArrayList<NativeCustomFormatAd> arrayList, a<? super CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1> aVar) {
        super(2, aVar);
        this.f24145h = list;
        this.f24146i = viewHolder;
        this.f24147j = context;
        this.f24148x = commercialAdsViewModel;
        this.f24149y = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1 commercialAdsItem$ViewHolder$loadCommercialBanners$1$1 = new CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1(this.f24145h, this.f24146i, this.f24147j, this.f24148x, this.f24149y, aVar);
        commercialAdsItem$ViewHolder$loadCommercialBanners$1$1.f24144g = obj;
        return commercialAdsItem$ViewHolder$loadCommercialBanners$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d3 -> B:21:0x00d5). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
