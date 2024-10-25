package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.b0;
import dj.i;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadATEListings$1", f = "ExpireSoonRepository.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExpireSoonRepository$loadATEListings$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ boolean $withRefreshCache;
    int label;
    final /* synthetic */ ExpireSoonRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExpireSoonRepository.kt */
    @d(c = "com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadATEListings$1$1", f = "ExpireSoonRepository.kt", l = {83}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadATEListings$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
        final /* synthetic */ boolean $withRefreshCache;
        int label;
        final /* synthetic */ ExpireSoonRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ExpireSoonRepository expireSoonRepository, boolean z11, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.this$0 = expireSoonRepository;
            this.$withRefreshCache = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.this$0, this.$withRefreshCache, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            b0 b0Var;
            Object fetchATEListings;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.label;
            try {
            } catch (Throwable th2) {
                i invoke = i.f54287a.invoke();
                invoke.c("About to Expire crash");
                invoke.f(th2);
            }
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                b0Var = this.this$0.aboutToExpireListings;
                if (b0Var.getValue() == 0 || this.$withRefreshCache) {
                    ExpireSoonRepository expireSoonRepository = this.this$0;
                    this.label = 1;
                    fetchATEListings = expireSoonRepository.fetchATEListings(this);
                    if (fetchATEListings == f11) {
                        return f11;
                    }
                }
                return wz.p.f75480a;
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonRepository$loadATEListings$1(ExpireSoonRepository expireSoonRepository, boolean z11, zz.a<? super ExpireSoonRepository$loadATEListings$1> aVar) {
        super(2, aVar);
        this.this$0 = expireSoonRepository;
        this.$withRefreshCache = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExpireSoonRepository$loadATEListings$1(this.this$0, this.$withRefreshCache, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$withRefreshCache, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ExpireSoonRepository$loadATEListings$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
