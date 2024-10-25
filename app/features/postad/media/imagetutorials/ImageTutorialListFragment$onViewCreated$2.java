package com.forsale.app.features.postad.media.imagetutorials;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: ImageTutorialListFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.imagetutorials.ImageTutorialListFragment$onViewCreated$2", f = "ImageTutorialListFragment.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ImageTutorialListFragment$onViewCreated$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35927a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ImageTutorialListFragment f35928b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageTutorialListFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.imagetutorials.ImageTutorialListFragment$onViewCreated$2$1", f = "ImageTutorialListFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialListFragment$onViewCreated$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35929a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ImageTutorialListFragment f35930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ImageTutorialListFragment imageTutorialListFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35930b = imageTutorialListFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35930b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35929a == 0) {
                kotlin.f.b(obj);
                androidx.navigation.fragment.a.a(this.f35930b).h0();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTutorialListFragment$onViewCreated$2(ImageTutorialListFragment imageTutorialListFragment, zz.a<? super ImageTutorialListFragment$onViewCreated$2> aVar) {
        super(1, aVar);
        this.f35928b = imageTutorialListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new ImageTutorialListFragment$onViewCreated$2(this.f35928b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35927a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<p> x02 = this.f35928b.B().x0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35928b, null);
            this.f35927a = 1;
            if (FlowKt.collectLatest(x02, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((ImageTutorialListFragment$onViewCreated$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
