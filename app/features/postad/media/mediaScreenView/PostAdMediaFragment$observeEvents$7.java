package com.forsale.app.features.postad.media.mediaScreenView;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.ui.dialogs.uploadProgress.UploadProgressDialog;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMediaFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$7", f = "PostAdMediaFragment.kt", l = {224}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaFragment$observeEvents$7 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36225a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaFragment f36226b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMediaFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$7$1", f = "PostAdMediaFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$7$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36227a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdMediaFragment f36228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdMediaFragment postAdMediaFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f36228b = postAdMediaFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f36228b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f36227a == 0) {
                kotlin.f.b(obj);
                PostAdMediaFragment postAdMediaFragment = this.f36228b;
                Context requireContext = this.f36228b.requireContext();
                o.h(requireContext, "requireContext(...)");
                s viewLifecycleOwner = this.f36228b.getViewLifecycleOwner();
                o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                LifecycleCoroutineScope a11 = t.a(viewLifecycleOwner);
                mutableStateFlow = this.f36228b.f36184g;
                postAdMediaFragment.f36190z = new UploadProgressDialog(requireContext, a11, mutableStateFlow);
                this.f36228b.V(0);
                this.f36228b.Y(true);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaFragment$observeEvents$7(PostAdMediaFragment postAdMediaFragment, zz.a<? super PostAdMediaFragment$observeEvents$7> aVar) {
        super(1, aVar);
        this.f36226b = postAdMediaFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdMediaFragment$observeEvents$7(this.f36226b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel M;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36225a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            M = this.f36226b.M();
            SharedFlow<p> U2 = M.U2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36226b, null);
            this.f36225a = 1;
            if (FlowKt.collectLatest(U2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdMediaFragment$observeEvents$7) create(aVar)).invokeSuspend(p.f75480a);
    }
}
