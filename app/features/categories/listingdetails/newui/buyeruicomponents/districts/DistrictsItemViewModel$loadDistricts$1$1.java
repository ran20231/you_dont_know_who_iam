package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts;

import com.forsale.app.datalayer.database.DistrictEntity;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DistrictsItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$loadDistricts$1$1", f = "DistrictsItemViewModel.kt", l = {60, 64}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DistrictsItemViewModel$loadDistricts$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f27413a;

    /* renamed from: b  reason: collision with root package name */
    Object f27414b;

    /* renamed from: c  reason: collision with root package name */
    Object f27415c;

    /* renamed from: d  reason: collision with root package name */
    int f27416d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<Integer> f27417e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ DistrictsItemViewModel f27418f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ List<DistrictEntity> f27419g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DistrictsItemViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$loadDistricts$1$1$2", f = "DistrictsItemViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$loadDistricts$1$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27420a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DistrictsItemViewModel f27421b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<DistrictEntity> f27422c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DistrictsItemViewModel districtsItemViewModel, List<DistrictEntity> list, a<? super AnonymousClass2> aVar) {
            super(2, aVar);
            this.f27421b = districtsItemViewModel;
            this.f27422c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass2(this.f27421b, this.f27422c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f27420a == 0) {
                f.b(obj);
                this.f27421b.k(this.f27422c);
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
    public DistrictsItemViewModel$loadDistricts$1$1(List<Integer> list, DistrictsItemViewModel districtsItemViewModel, List<DistrictEntity> list2, a<? super DistrictsItemViewModel$loadDistricts$1$1> aVar) {
        super(2, aVar);
        this.f27417e = list;
        this.f27418f = districtsItemViewModel;
        this.f27419g = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new DistrictsItemViewModel$loadDistricts$1$1(this.f27417e, this.f27418f, this.f27419g, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:17:0x006c). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.f27416d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.f.b(r10)
            goto L96
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            java.lang.Object r1 = r9.f27415c
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.f27414b
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r9.f27413a
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r5 = (com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel) r5
            kotlin.f.b(r10)
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L6c
        L30:
            kotlin.f.b(r10)
            java.util.List<java.lang.Integer> r10 = r9.f27417e
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r1 = r9.f27418f
            java.util.List<com.forsale.app.datalayer.database.DistrictEntity> r4 = r9.f27419g
            java.util.Iterator r10 = r10.iterator()
            r5 = r1
            r1 = r10
            r10 = r9
        L42:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L79
            java.lang.Object r6 = r1.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            com.forsale.app.datalayer.repositories.DistrictsRepository r7 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.b(r5)
            r10.f27413a = r5
            r10.f27414b = r4
            r10.f27415c = r1
            r10.f27416d = r3
            java.lang.Object r6 = r7.getDistrictByDistrictId(r6, r10)
            if (r6 != r0) goto L65
            return r0
        L65:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        L6c:
            com.forsale.app.datalayer.database.DistrictEntity r10 = (com.forsale.app.datalayer.database.DistrictEntity) r10
            if (r10 == 0) goto L73
            r5.add(r10)
        L73:
            r10 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            goto L42
        L79:
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$loadDistricts$1$1$2 r3 = new com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$loadDistricts$1$1$2
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r4 = r10.f27418f
            java.util.List<com.forsale.app.datalayer.database.DistrictEntity> r5 = r10.f27419g
            r6 = 0
            r3.<init>(r4, r5, r6)
            r10.f27413a = r6
            r10.f27414b = r6
            r10.f27415c = r6
            r10.f27416d = r2
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r10)
            if (r10 != r0) goto L96
            return r0
        L96:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$loadDistricts$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((DistrictsItemViewModel$loadDistricts$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
