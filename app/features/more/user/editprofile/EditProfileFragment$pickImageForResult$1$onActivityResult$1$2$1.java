package com.forsale.app.features.more.user.editprofile;

import android.content.Context;
import android.net.Uri;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import com.forsale.app.utils.UriExtensionsKt;
import g00.l;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileFragment$pickImageForResult$1$onActivityResult$1$2$1", f = "EditProfileFragment.kt", l = {138, 139}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileFragment$pickImageForResult$1$onActivityResult$1$2$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32960a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f32961b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EditProfileFragment f32962c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileFragment$pickImageForResult$1$onActivityResult$1$2$1$1", f = "EditProfileFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.user.editprofile.EditProfileFragment$pickImageForResult$1$onActivityResult$1$2$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<File, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32963a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f32964b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditProfileFragment f32965c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EditProfileFragment editProfileFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f32965c = editProfileFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(File file, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(file, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32965c, aVar);
            anonymousClass1.f32964b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f32963a == 0) {
                kotlin.f.b(obj);
                this.f32965c.E().m0((File) this.f32964b);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileFragment$pickImageForResult$1$onActivityResult$1$2$1(String str, EditProfileFragment editProfileFragment, zz.a<? super EditProfileFragment$pickImageForResult$1$onActivityResult$1$2$1> aVar) {
        super(1, aVar);
        this.f32961b = str;
        this.f32962c = editProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new EditProfileFragment$pickImageForResult$1$onActivityResult$1$2$1(this.f32961b, this.f32962c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f32960a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            Uri fromFile = Uri.fromFile(new File(this.f32961b));
            o.h(fromFile, "fromFile(...)");
            Context requireContext = this.f32962c.requireContext();
            o.h(requireContext, "requireContext(...)");
            this.f32960a = 1;
            obj = UriExtensionsKt.a(fromFile, requireContext, this);
            if (obj == f11) {
                return f11;
            }
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32962c, null);
        this.f32960a = 2;
        if (CoroutinesExtensionsKt.a(obj, anonymousClass1, this) == f11) {
            return f11;
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((EditProfileFragment$pickImageForResult$1$onActivityResult$1$2$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
