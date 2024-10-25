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
/* compiled from: NameTextField.kt */
/* loaded from: classes2.dex */
public final class NameTextFieldKt {
    public static final void a(final a userModel, final TextFieldState nameState, final g00.a<p> clearErrorMessage, androidx.compose.runtime.a aVar, final int i11) {
        r0.a aVar2;
        o.i(userModel, "userModel");
        o.i(nameState, "nameState");
        o.i(clearErrorMessage, "clearErrorMessage");
        androidx.compose.runtime.a h11 = aVar.h(-299897789);
        if (c.I()) {
            c.U(-299897789, i11, -1, "com.forsale.app.features.auth.views.NameTextField (NameTextField.kt:27)");
        }
        nameState.m(userModel.d());
        String e11 = nameState.e();
        androidx.compose.ui.c a11 = TestTagKt.a(b.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), new l<z0.l, p>() { // from class: com.forsale.app.features.auth.views.NameTextFieldKt$NameTextField$1
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
        }), ComponentsTags.NAME_FILED.getTag());
        a0 b11 = dk.a.f54291a.c(h11, dk.a.f54292b).b();
        boolean n11 = nameState.n();
        d dVar = (d) h11.q(CompositionLocalsKt.f());
        if (nameState.n()) {
            aVar2 = r0.b.b(h11, 1659804405, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.NameTextFieldKt$NameTextField$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    String str;
                    if ((i12 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(1659804405, i12, -1, "com.forsale.app.features.auth.views.NameTextField.<anonymous> (NameTextField.kt:54)");
                    }
                    String str2 = null;
                    rj.a aVar4 = (rj.a) z.b(TextFieldState.this.c(), null, aVar3, 8, 1).getValue();
                    aVar3.C(1089885313);
                    if (aVar4 != null) {
                        str2 = aVar4.a(aVar3, rj.a.f68042a);
                    }
                    aVar3.S();
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    TextKt.a(str, TestTagKt.a(androidx.compose.ui.c.f7566a, ComponentsTags.NAME_VALIDATION_MESSAGE.getTag()), 0, 0, false, 0, 0, null, dk.a.f54291a.c(aVar3, dk.a.f54292b).h(), 0L, 0, aVar3, 48, 0, 1788);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        } else {
            aVar2 = null;
        }
        InputsKt.k(a11, e11, new l<String, p>() { // from class: com.forsale.app.features.auth.views.NameTextFieldKt$NameTextField$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(String it2) {
                o.i(it2, "it");
                TextFieldState.this.m(it2);
                userModel.h(it2);
                clearErrorMessage.invoke();
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }, false, n11, false, null, null, null, null, null, aVar2, ComposableSingletons$NameTextFieldKt.f23132a.a(), null, dVar, null, null, new androidx.compose.foundation.text.c(0, false, b0.f9448a.h(), 0, null, 27, null), null, b11, null, h11, 0, 12616064, 0, 1419240);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.NameTextFieldKt$NameTextField$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    NameTextFieldKt.a(a.this, nameState, clearErrorMessage, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
