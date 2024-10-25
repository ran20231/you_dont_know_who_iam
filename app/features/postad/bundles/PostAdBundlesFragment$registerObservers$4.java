package com.forsale.app.features.postad.bundles;

import android.content.Intent;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdBundlesFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$4", f = "PostAdBundlesFragment.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdBundlesFragment$registerObservers$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34999a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesFragment f35000b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdBundlesFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$4$1", f = "PostAdBundlesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<PublishAdvViewModel.a, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35001a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35002b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdBundlesFragment f35003c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35003c = postAdBundlesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(PublishAdvViewModel.a aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35003c, aVar);
            anonymousClass1.f35002b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PostListingIntention E;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35001a == 0) {
                kotlin.f.b(obj);
                PublishAdvViewModel.a aVar = (PublishAdvViewModel.a) this.f35002b;
                androidx.fragment.app.p activity = this.f35003c.getActivity();
                if (activity != null) {
                    Intent intent = new Intent();
                    PostAdBundlesFragment postAdBundlesFragment = this.f35003c;
                    E = postAdBundlesFragment.E();
                    intent.putExtra("intention_key", E);
                    intent.putExtra("MEDIA_UPLOAD_FAILED", postAdBundlesFragment.H().y3());
                    intent.putExtra("ATTEMPT_ABUSE", aVar.a());
                    intent.putExtra("IS_SUCCESS", aVar.b());
                    p pVar = p.f75480a;
                    activity.setResult(-1, intent);
                }
                androidx.fragment.app.p activity2 = this.f35003c.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesFragment$registerObservers$4(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super PostAdBundlesFragment$registerObservers$4> aVar) {
        super(1, aVar);
        this.f35000b = postAdBundlesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdBundlesFragment$registerObservers$4(this.f35000b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34999a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<PublishAdvViewModel.a> O = this.f35000b.H().N2().O();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35000b, null);
            this.f34999a = 1;
            if (FlowKt.collectLatest(O, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdBundlesFragment$registerObservers$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}
