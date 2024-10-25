package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem;

import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreviewCardItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel$loadDistricts$1$1", f = "PreviewCardItemViewModel.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PreviewCardItemViewModel$loadDistricts$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f27893a;

    /* renamed from: b  reason: collision with root package name */
    Object f27894b;

    /* renamed from: c  reason: collision with root package name */
    Object f27895c;

    /* renamed from: d  reason: collision with root package name */
    int f27896d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<Integer> f27897e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ PreviewCardItemViewModel f27898f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ List<String> f27899g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCardItemViewModel$loadDistricts$1$1(List<Integer> list, PreviewCardItemViewModel previewCardItemViewModel, List<String> list2, a<? super PreviewCardItemViewModel$loadDistricts$1$1> aVar) {
        super(2, aVar);
        this.f27897e = list;
        this.f27898f = previewCardItemViewModel;
        this.f27899g = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PreviewCardItemViewModel$loadDistricts$1$1(this.f27897e, this.f27898f, this.f27899g, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005d -> B:15:0x0064). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r11.f27896d
            r2 = 1
            if (r1 == 0) goto L28
            if (r1 != r2) goto L20
            java.lang.Object r1 = r11.f27895c
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r11.f27894b
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r11.f27893a
            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r4 = (com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel) r4
            kotlin.f.b(r12)
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r11
            goto L64
        L20:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L28:
            kotlin.f.b(r12)
            java.util.List<java.lang.Integer> r12 = r11.f27897e
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r1 = r11.f27898f
            java.util.List<java.lang.String> r3 = r11.f27899g
            java.util.Iterator r12 = r12.iterator()
            r4 = r1
            r1 = r12
            r12 = r11
        L3a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r5 = r1.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            com.forsale.app.datalayer.repositories.DistrictsRepository r6 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.b(r4)
            r12.f27893a = r4
            r12.f27894b = r3
            r12.f27895c = r1
            r12.f27896d = r2
            java.lang.Object r5 = r6.getDistrictByDistrictId(r5, r12)
            if (r5 != r0) goto L5d
            return r0
        L5d:
            r10 = r0
            r0 = r12
            r12 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r10
        L64:
            com.forsale.app.datalayer.database.DistrictEntity r12 = (com.forsale.app.datalayer.database.DistrictEntity) r12
            if (r12 == 0) goto L71
            java.lang.String r12 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.a(r5, r12)
            if (r12 == 0) goto L71
            r4.add(r12)
        L71:
            r12 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            goto L3a
        L77:
            com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r0 = r12.f27898f
            androidx.lifecycle.b0 r0 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.c(r0)
            java.util.List<java.lang.String> r12 = r12.f27899g
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r2 = " - "
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            r9 = 0
            java.lang.String r12 = kotlin.collections.p.t0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.postValue(r12)
            wz.p r12 = wz.p.f75480a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel$loadDistricts$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PreviewCardItemViewModel$loadDistricts$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
