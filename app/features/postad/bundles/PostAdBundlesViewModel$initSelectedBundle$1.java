package com.forsale.app.features.postad.bundles;

import com.forsale.app.datalayer.network.responses.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdBundlesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$initSelectedBundle$1", f = "PostAdBundlesViewModel.kt", l = {FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdBundlesViewModel$initSelectedBundle$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35031a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesViewModel f35032b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdBundlesViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$initSelectedBundle$1$1", f = "PostAdBundlesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$initSelectedBundle$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Bundle, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35033a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35034b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdBundlesViewModel f35035c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdBundlesViewModel postAdBundlesViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35035c = postAdBundlesViewModel;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Bundle bundle, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(bundle, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35035c, aVar);
            anonymousClass1.f35034b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35033a == 0) {
                kotlin.f.b(obj);
                this.f35035c.M((Bundle) this.f35034b);
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesViewModel$initSelectedBundle$1(PostAdBundlesViewModel postAdBundlesViewModel, zz.a<? super PostAdBundlesViewModel$initSelectedBundle$1> aVar) {
        super(2, aVar);
        this.f35032b = postAdBundlesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdBundlesViewModel$initSelectedBundle$1(this.f35032b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35031a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f35032b.f35009f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35032b, null);
            this.f35031a = 1;
            if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdBundlesViewModel$initSelectedBundle$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
