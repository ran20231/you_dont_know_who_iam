package com.forsale.app.features.auth.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.a0;
import androidx.compose.ui.text.input.b0;
import com.forsale.app.features.auth.utils.ComponentsTags;
import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.inputs.InputsKt;
import g00.l;
import j0.d1;
import j0.v0;
import ja.a;
import kotlin.jvm.internal.o;
import wz.p;
import z0.d;
/* compiled from: EmailTextField.kt */
/* loaded from: classes2.dex */
public final class EmailTextFieldKt {
    public static final void a(final a userModel, final TextFieldState emailState, final g00.a<p> clearErrorMessage, androidx.compose.runtime.a aVar, final int i11) {
        o.i(userModel, "userModel");
        o.i(emailState, "emailState");
        o.i(clearErrorMessage, "clearErrorMessage");
        androidx.compose.runtime.a h11 = aVar.h(949594720);
        if (c.I()) {
            c.U(949594720, i11, -1, "com.forsale.app.features.auth.views.EmailField (EmailTextField.kt:27)");
        }
        emailState.m(userModel.c());
        String e11 = emailState.e();
        androidx.compose.ui.c a11 = TestTagKt.a(b.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), new l<z0.l, p>() { // from class: com.forsale.app.features.auth.views.EmailTextFieldKt$EmailField$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(z0.l focusState) {
                o.i(focusState, "focusState");
                TextFieldState.this.h(focusState.isFocused());
                if (!focusState.isFocused()) {
                    TextFieldState.this.a();
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(z0.l lVar) {
                b(lVar);
                return p.f75480a;
            }
        }), ComponentsTags.EMAIL_FILED.getTag());
        a0 b11 = dk.a.f54291a.c(h11, dk.a.f54292b).b();
        InputsKt.k(a11, e11, new l<String, p>() { // from class: com.forsale.app.features.auth.views.EmailTextFieldKt$EmailField$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(String it2) {
                o.i(it2, "it");
                TextFieldState.this.m(it2);
                userModel.g(it2);
                clearErrorMessage.invoke();
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }, false, emailState.n(), false, null, null, null, null, null, r0.b.b(h11, 1451235114, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.EmailTextFieldKt$EmailField$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                String str;
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (c.I()) {
                    c.U(1451235114, i12, -1, "com.forsale.app.features.auth.views.EmailField.<anonymous> (EmailTextField.kt:54)");
                }
                if (TextFieldState.this.n()) {
                    String str2 = null;
                    rj.a aVar3 = (rj.a) z.b(TextFieldState.this.c(), null, aVar2, 8, 1).getValue();
                    aVar2.C(1169726303);
                    if (aVar3 != null) {
                        str2 = aVar3.a(aVar2, rj.a.f68042a);
                    }
                    aVar2.S();
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    TextKt.a(str, TestTagKt.a(androidx.compose.ui.c.f7566a, ComponentsTags.EMAIL_VALIDATION_MESSAGE.getTag()), 0, 0, false, 0, 0, null, dk.a.f54291a.c(aVar2, dk.a.f54292b).h(), 0L, 0, aVar2, 48, 0, 1788);
                }
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return p.f75480a;
            }
        }), ComposableSingletons$EmailTextFieldKt.f23129a.a(), null, (d) h11.q(CompositionLocalsKt.f()), null, null, new androidx.compose.foundation.text.c(0, false, b0.f9448a.c(), 0, null, 27, null), null, b11, null, h11, 0, 12616112, 0, 1419240);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.EmailTextFieldKt$EmailField$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    EmailTextFieldKt.a(a.this, emailState, clearErrorMessage, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
