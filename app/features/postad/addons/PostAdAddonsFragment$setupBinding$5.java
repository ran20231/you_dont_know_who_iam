package com.forsale.app.features.postad.addons;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsFragment.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$5", f = "PostAdAddonsFragment.kt", l = {201}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment$setupBinding$5 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34291a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsFragment f34292b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$5$1", f = "PostAdAddonsFragment.kt", l = {202}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$5$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsFragment f34294b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostAdAddonsFragment.kt */
        @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$5$1$1", f = "PostAdAddonsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$5$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03791 extends SuspendLambda implements p<PublishAdvViewModel.a, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f34295a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f34296b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PostAdAddonsFragment f34297c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03791(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super C03791> aVar) {
                super(2, aVar);
                this.f34297c = postAdAddonsFragment;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(PublishAdvViewModel.a aVar, zz.a<? super wz.p> aVar2) {
                return ((C03791) create(aVar, aVar2)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C03791 c03791 = new C03791(this.f34297c, aVar);
                c03791.f34296b = obj;
                return c03791;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                PostListingIntention f02;
                PostAdViewModel i02;
                kotlin.coroutines.intrinsics.b.f();
                if (this.f34295a == 0) {
                    f.b(obj);
                    PublishAdvViewModel.a aVar = (PublishAdvViewModel.a) this.f34296b;
                    androidx.fragment.app.p activity = this.f34297c.getActivity();
                    if (activity != null) {
                        Intent intent = new Intent();
                        PostAdAddonsFragment postAdAddonsFragment = this.f34297c;
                        f02 = postAdAddonsFragment.f0();
                        intent.putExtra("intention_key", f02);
                        i02 = postAdAddonsFragment.i0();
                        intent.putExtra("MEDIA_UPLOAD_FAILED", i02.y3());
                        intent.putExtra("ATTEMPT_ABUSE", aVar.a());
                        intent.putExtra("IS_SUCCESS", aVar.b());
                        wz.p pVar = wz.p.f75480a;
                        activity.setResult(-1, intent);
                    }
                    androidx.fragment.app.p activity2 = this.f34297c.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34294b = postAdAddonsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34294b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            PostAdViewModel i02;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f34293a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                i02 = this.f34294b.i0();
                SharedFlow<PublishAdvViewModel.a> O = i02.N2().O();
                C03791 c03791 = new C03791(this.f34294b, null);
                this.f34293a = 1;
                if (FlowKt.collectLatest(O, c03791, this) == f11) {
                    return f11;
                }
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
    public PostAdAddonsFragment$setupBinding$5(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super PostAdAddonsFragment$setupBinding$5> aVar) {
        super(2, aVar);
        this.f34292b = postAdAddonsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsFragment$setupBinding$5(this.f34292b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34291a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s viewLifecycleOwner = this.f34292b.getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34292b, null);
            this.f34291a = 1;
            if (RepeatOnLifecycleKt.b(viewLifecycleOwner, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsFragment$setupBinding$5) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
