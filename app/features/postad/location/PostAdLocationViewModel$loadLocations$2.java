package com.forsale.app.features.postad.location;

import com.forsale.app.datalayer.database.CategoryRuleSet;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$loadLocations$2", f = "PostAdLocationViewModel.kt", l = {610, 614}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$loadLocations$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35728a;

    /* renamed from: b  reason: collision with root package name */
    Object f35729b;

    /* renamed from: c  reason: collision with root package name */
    Object f35730c;

    /* renamed from: d  reason: collision with root package name */
    int f35731d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Object f35732e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Integer f35733f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35734g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ CategoryRuleSet.Level f35735h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$loadLocations$2(Integer num, PostAdLocationViewModel postAdLocationViewModel, CategoryRuleSet.Level level, zz.a<? super PostAdLocationViewModel$loadLocations$2> aVar) {
        super(2, aVar);
        this.f35733f = num;
        this.f35734g = postAdLocationViewModel;
        this.f35735h = level;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        PostAdLocationViewModel$loadLocations$2 postAdLocationViewModel$loadLocations$2 = new PostAdLocationViewModel$loadLocations$2(this.f35733f, this.f35734g, this.f35735h, aVar);
        postAdLocationViewModel$loadLocations$2.f35732e = obj;
        return postAdLocationViewModel$loadLocations$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r12 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r11.f35731d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L28
            if (r1 != r3) goto L20
            java.lang.Object r0 = r11.f35729b
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r1 = r11.f35728a
            com.forsale.app.datalayer.database.CategoryRuleSet$Level r1 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r1
            java.lang.Object r2 = r11.f35732e
            com.forsale.app.features.postad.location.PostAdLocationViewModel r2 = (com.forsale.app.features.postad.location.PostAdLocationViewModel) r2
            kotlin.f.b(r12)
            goto L97
        L20:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L28:
            java.lang.Object r1 = r11.f35730c
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r11.f35729b
            com.forsale.app.datalayer.database.CategoryRuleSet$Level r4 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r4
            java.lang.Object r5 = r11.f35728a
            com.forsale.app.features.postad.location.PostAdLocationViewModel r5 = (com.forsale.app.features.postad.location.PostAdLocationViewModel) r5
            java.lang.Object r6 = r11.f35732e
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            kotlin.f.b(r12)
            goto L69
        L3c:
            kotlin.f.b(r12)
            java.lang.Object r12 = r11.f35732e
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
            java.lang.Integer r1 = r11.f35733f
            if (r1 == 0) goto L74
            com.forsale.app.features.postad.location.PostAdLocationViewModel r5 = r11.f35734g
            com.forsale.app.datalayer.database.CategoryRuleSet$Level r6 = r11.f35735h
            int r7 = r1.intValue()
            com.forsale.app.datalayer.repositories.DistrictsRepository r8 = r5.q1()
            int r9 = r6.getLevel()
            r11.f35732e = r12
            r11.f35728a = r5
            r11.f35729b = r6
            r11.f35730c = r1
            r11.f35731d = r4
            java.lang.Object r12 = r8.getAllDistrictsByLevelAndParentId(r9, r7, r11)
            if (r12 != r0) goto L68
            return r0
        L68:
            r4 = r6
        L69:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L71
            com.forsale.app.features.postad.location.PostAdLocationViewModel.O0(r5, r12, r4, r1)
            goto L72
        L71:
            r12 = r2
        L72:
            if (r12 != 0) goto L9e
        L74:
            com.forsale.app.features.postad.location.PostAdLocationViewModel r12 = r11.f35734g
            com.forsale.app.datalayer.database.CategoryRuleSet$Level r1 = r11.f35735h
            java.lang.Integer r4 = r11.f35733f
            com.forsale.app.datalayer.repositories.DistrictsRepository r5 = r12.q1()
            int r6 = r1.getLevel()
            r11.f35732e = r12
            r11.f35728a = r1
            r11.f35729b = r4
            r11.f35730c = r2
            r11.f35731d = r3
            java.lang.Object r2 = r5.getAllDistrictsByLevel(r6, r11)
            if (r2 != r0) goto L93
            return r0
        L93:
            r0 = r4
            r10 = r2
            r2 = r12
            r12 = r10
        L97:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L9e
            com.forsale.app.features.postad.location.PostAdLocationViewModel.O0(r2, r12, r1, r0)
        L9e:
            wz.p r12 = wz.p.f75480a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel$loadLocations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$loadLocations$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
