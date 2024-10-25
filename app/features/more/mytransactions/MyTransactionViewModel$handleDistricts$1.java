package com.forsale.app.features.more.mytransactions;

import com.forsale.app.datalayer.database.CategoryEntity;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyTransactionViewModel.kt */
@d(c = "com.forsale.app.features.more.mytransactions.MyTransactionViewModel$handleDistricts$1", f = "MyTransactionViewModel.kt", l = {l8.a.f62267d}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MyTransactionViewModel$handleDistricts$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31999a;

    /* renamed from: b  reason: collision with root package name */
    Object f32000b;

    /* renamed from: c  reason: collision with root package name */
    Object f32001c;

    /* renamed from: d  reason: collision with root package name */
    int f32002d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<Integer> f32003e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ MyTransactionViewModel f32004f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f32005g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionViewModel$handleDistricts$1(List<Integer> list, MyTransactionViewModel myTransactionViewModel, CategoryEntity categoryEntity, zz.a<? super MyTransactionViewModel$handleDistricts$1> aVar) {
        super(2, aVar);
        this.f32003e = list;
        this.f32004f = myTransactionViewModel;
        this.f32005g = categoryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MyTransactionViewModel$handleDistricts$1(this.f32003e, this.f32004f, this.f32005g, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005f -> B:15:0x0066). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f32002d
            r2 = 1
            if (r1 == 0) goto L28
            if (r1 != r2) goto L20
            java.lang.Object r1 = r8.f32001c
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r8.f32000b
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel r3 = (com.forsale.app.features.more.mytransactions.MyTransactionViewModel) r3
            java.lang.Object r4 = r8.f31999a
            java.util.List r4 = (java.util.List) r4
            kotlin.f.b(r9)
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            goto L66
        L20:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L28:
            kotlin.f.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List<java.lang.Integer> r1 = r8.f32003e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel r3 = r8.f32004f
            java.util.Iterator r1 = r1.iterator()
            r4 = r9
            r9 = r8
        L3c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r1.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            com.forsale.app.datalayer.repositories.DistrictsRepository r6 = com.forsale.app.features.more.mytransactions.MyTransactionViewModel.c(r3)
            r9.f31999a = r4
            r9.f32000b = r3
            r9.f32001c = r1
            r9.f32002d = r2
            java.lang.Object r5 = r6.getDistrictByDistrictId(r5, r9)
            if (r5 != r0) goto L5f
            return r0
        L5f:
            r7 = r0
            r0 = r9
            r9 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r7
        L66:
            com.forsale.app.datalayer.database.DistrictEntity r9 = (com.forsale.app.datalayer.database.DistrictEntity) r9
            if (r9 == 0) goto L6d
            r5.add(r9)
        L6d:
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            goto L3c
        L73:
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel r0 = r9.f32004f
            com.forsale.app.datalayer.database.CategoryEntity r9 = r9.f32005g
            com.forsale.app.features.more.mytransactions.MyTransactionViewModel.a(r0, r9, r4)
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.mytransactions.MyTransactionViewModel$handleDistricts$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MyTransactionViewModel$handleDistricts$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
