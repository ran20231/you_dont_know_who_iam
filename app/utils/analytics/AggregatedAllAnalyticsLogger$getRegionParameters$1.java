package com.forsale.app.utils.analytics;

import g00.p;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getRegionParameters$1", f = "AggregatedAllAnalyticsLogger.kt", l = {922}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getRegionParameters$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f39797a;

    /* renamed from: b  reason: collision with root package name */
    int f39798b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f39799c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<List<Pair<String, String>>> f39800d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39801e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getRegionParameters$1(Ref$ObjectRef<List<Pair<String, String>>> ref$ObjectRef, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getRegionParameters$1> aVar) {
        super(2, aVar);
        this.f39800d = ref$ObjectRef;
        this.f39801e = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        AggregatedAllAnalyticsLogger$getRegionParameters$1 aggregatedAllAnalyticsLogger$getRegionParameters$1 = new AggregatedAllAnalyticsLogger$getRegionParameters$1(this.f39800d, this.f39801e, aVar);
        aggregatedAllAnalyticsLogger$getRegionParameters$1.f39799c = obj;
        return aggregatedAllAnalyticsLogger$getRegionParameters$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
        if (r8 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f39798b
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 != r4) goto L19
            java.lang.Object r0 = r7.f39797a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            java.lang.Object r1 = r7.f39799c
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.f.b(r8)
            goto L6a
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            kotlin.f.b(r8)
            java.lang.Object r8 = r7.f39799c
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            kotlin.jvm.internal.Ref$ObjectRef<java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>> r1 = r7.f39800d
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r5 = r7.f39801e
            androidx.lifecycle.b0 r5 = r5.Y()
            java.lang.Object r5 = r5.getValue()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L41
            int r5 = r5.length()
            if (r5 != 0) goto L3f
            goto L41
        L3f:
            r5 = r3
            goto L42
        L41:
            r5 = r4
        L42:
            if (r5 == 0) goto La2
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r5 = r7.f39801e
            androidx.lifecycle.b0 r5 = r5.X()
            java.lang.Object r5 = r5.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L9d
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r6 = r7.f39801e
            com.forsale.app.datalayer.repositories.RegionsRepository r6 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.c(r6)
            int r5 = r5.intValue()
            r7.f39799c = r8
            r7.f39797a = r1
            r7.f39798b = r4
            java.lang.Object r8 = r6.getRegionById(r5, r7)
            if (r8 != r0) goto L69
            return r0
        L69:
            r0 = r1
        L6a:
            com.forsale.app.datalayer.database.RegionEntity r8 = (com.forsale.app.datalayer.database.RegionEntity) r8
            if (r8 == 0) goto L99
            kotlin.Pair[] r1 = new kotlin.Pair[r2]
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.RegionName
            java.lang.String r2 = r2.getValue()
            java.lang.String r5 = r8.getNameEn()
            kotlin.Pair r2 = wz.i.a(r2, r5)
            r1[r3] = r2
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.RegionID
            java.lang.String r2 = r2.getValue()
            int r8 = r8.getId()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            kotlin.Pair r8 = wz.i.a(r2, r8)
            r1[r4] = r8
            java.util.List r8 = kotlin.collections.p.q(r1)
            goto L9a
        L99:
            r8 = 0
        L9a:
            r1 = r0
            if (r8 != 0) goto Lf9
        L9d:
            java.util.List r8 = kotlin.collections.p.n()
            goto Lf9
        La2:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r8 = r7.f39801e
            androidx.lifecycle.b0 r8 = r8.X()
            java.lang.Object r8 = r8.getValue()
            if (r8 == 0) goto Lf5
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r8 = r7.f39801e
            androidx.lifecycle.b0 r8 = r8.Y()
            java.lang.Object r8 = r8.getValue()
            if (r8 == 0) goto Lf5
            kotlin.Pair[] r8 = new kotlin.Pair[r2]
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r0 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.RegionName
            java.lang.String r0 = r0.getValue()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r2 = r7.f39801e
            androidx.lifecycle.b0 r2 = r2.Y()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlin.Pair r0 = wz.i.a(r0, r2)
            r8[r3] = r0
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r0 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.RegionID
            java.lang.String r0 = r0.getValue()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r2 = r7.f39801e
            androidx.lifecycle.b0 r2 = r2.X()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlin.Pair r0 = wz.i.a(r0, r2)
            r8[r4] = r0
            java.util.List r8 = kotlin.collections.p.q(r8)
            goto Lf9
        Lf5:
            java.util.List r8 = kotlin.collections.p.n()
        Lf9:
            r1.f61778a = r8
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getRegionParameters$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AggregatedAllAnalyticsLogger$getRegionParameters$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
