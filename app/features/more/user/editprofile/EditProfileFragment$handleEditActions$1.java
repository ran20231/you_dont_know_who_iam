package com.forsale.app.features.more.user.editprofile;

import android.content.Context;
import com.forsale.app.features.more.user.editprofile.a;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileFragment$handleEditActions$1", f = "EditProfileFragment.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileFragment$handleEditActions$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32949a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileFragment f32950b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileFragment$handleEditActions$1$1", f = "EditProfileFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.user.editprofile.EditProfileFragment$handleEditActions$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<a, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32951a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f32952b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditProfileFragment f32953c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EditProfileFragment editProfileFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f32953c = editProfileFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(a aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32953c, aVar);
            anonymousClass1.f32952b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f32951a == 0) {
                kotlin.f.b(obj);
                a aVar = (a) this.f32952b;
                if (aVar instanceof a.d) {
                    androidx.navigation.fragment.a.a(this.f32953c).d0(c.f33134a.a());
                } else if (aVar instanceof a.c) {
                    final EditProfileFragment editProfileFragment = this.f32953c;
                    editProfileFragment.J(new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment.handleEditActions.1.1.2
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            androidx.activity.result.b bVar;
                            dj.a D;
                            bVar = EditProfileFragment.this.f32916h;
                            D = EditProfileFragment.this.D();
                            Context requireContext = EditProfileFragment.this.requireContext();
                            o.h(requireContext, "requireContext(...)");
                            bVar.a(D.c(requireContext, 1, true));
                        }
                    });
                } else if (aVar instanceof a.C0360a) {
                    androidx.navigation.fragment.a.a(this.f32953c).d0(c.f33134a.b());
                } else if (aVar instanceof a.e) {
                    this.f32953c.E().k0(true);
                } else if (aVar instanceof a.b) {
                    this.f32953c.E().j0(true);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileFragment$handleEditActions$1(EditProfileFragment editProfileFragment, zz.a<? super EditProfileFragment$handleEditActions$1> aVar) {
        super(1, aVar);
        this.f32950b = editProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new EditProfileFragment$handleEditActions$1(this.f32950b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f32949a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<a> M = this.f32950b.E().M();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32950b, null);
            this.f32949a = 1;
            if (FlowKt.collectLatest(M, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((EditProfileFragment$handleEditActions$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
