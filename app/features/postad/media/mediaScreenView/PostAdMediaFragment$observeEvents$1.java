package com.forsale.app.features.postad.media.mediaScreenView;

import android.content.Context;
import android.content.Intent;
import bf.i;
import bf.j;
import bf.k;
import com.forsale.app.features.postad.PostAdScreens;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.forsale.app.utils.r;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMediaFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$1", f = "PostAdMediaFragment.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaFragment$observeEvents$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36206a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaFragment f36207b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMediaFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$1$1", f = "PostAdMediaFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<k, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36208a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f36209b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdMediaFragment f36210c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdMediaFragment postAdMediaFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f36210c = postAdMediaFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(k kVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(kVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36210c, aVar);
            anonymousClass1.f36209b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PostAdViewModel M;
            androidx.activity.result.b bVar;
            dj.c K;
            androidx.activity.result.b bVar2;
            dj.e L;
            androidx.activity.result.b bVar3;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f36208a == 0) {
                kotlin.f.b(obj);
                k kVar = (k) this.f36209b;
                if (kVar instanceof bf.d) {
                    bVar3 = this.f36210c.A;
                    dj.a J = this.f36210c.J();
                    Context requireContext = this.f36210c.requireContext();
                    o.h(requireContext, "requireContext(...)");
                    bVar3.a(J.c(requireContext, ((bf.d) kVar).a(), true));
                } else if (kVar instanceof bf.f) {
                    L = this.f36210c.L();
                    L.b(this.f36210c, ((bf.f) kVar).a().e(), "Q84SALE_IMAGES");
                } else if (kVar instanceof bf.c) {
                    K = this.f36210c.K();
                    Context requireContext2 = this.f36210c.requireContext();
                    o.h(requireContext2, "requireContext(...)");
                    Intent a11 = K.a(requireContext2, ((bf.c) kVar).a().e());
                    if (a11 != null) {
                        bVar2 = this.f36210c.B;
                        bVar2.a(a11);
                    }
                } else if (kVar instanceof bf.h) {
                    bVar = this.f36210c.C;
                    dj.a J2 = this.f36210c.J();
                    Context requireContext3 = this.f36210c.requireContext();
                    o.h(requireContext3, "requireContext(...)");
                    bVar.a(J2.d(requireContext3, ((bf.h) kVar).a(), 1));
                } else if (kVar instanceof j) {
                    Context requireContext4 = this.f36210c.requireContext();
                    o.h(requireContext4, "requireContext(...)");
                    r.a(requireContext4, ((j) kVar).a().e());
                } else if (kVar instanceof bf.g) {
                    ViewsExtensionsKt.J(this.f36210c, ((bf.g) kVar).a());
                } else if (o.d(kVar, bf.e.f16344a)) {
                    this.f36210c.O().i1();
                } else if (o.d(kVar, i.f16349a)) {
                    this.f36210c.O().j1();
                    M = this.f36210c.M();
                    M.N1(PostAdScreens.MEDIA_SCREEN);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaFragment$observeEvents$1(PostAdMediaFragment postAdMediaFragment, zz.a<? super PostAdMediaFragment$observeEvents$1> aVar) {
        super(1, aVar);
        this.f36207b = postAdMediaFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdMediaFragment$observeEvents$1(this.f36207b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36206a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<k> G0 = this.f36207b.O().G0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36207b, null);
            this.f36206a = 1;
            if (FlowKt.collectLatest(G0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdMediaFragment$observeEvents$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
