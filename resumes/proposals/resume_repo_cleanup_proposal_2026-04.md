# Resume Repository Cleanup Proposal (April 2026)

## Objective
Create a clean, maintainable resume repository with:
1. One authoritative, up-to-date resume source.
2. Multiple export formats for different job portals and recruiters.
3. Archived historical versions for traceability.

## Proposed Repository Structure
```
resumes/
  current/
    Janaka_Premathilaka_Resume_2026-04.md     # source of truth
    Janaka_Premathilaka_Resume_2026-04.txt    # ATS / plain text submission
    Janaka_Premathilaka_Resume_2026-04.html   # web/share format
  archive/
    ... old versions moved here ...
  proposals/
    resume_repo_cleanup_proposal_2026-04.md
```

## Format Strategy
- **Markdown (.md):** Primary editable source.
- **Text (.txt):** Easy copy/paste for job forms.
- **HTML (.html):** Easy browser preview and sharing.
- **PDF (.pdf):** Keep one polished printable version as the external-facing default.

## Naming Convention
Use `Janaka_Premathilaka_Resume_YYYY-MM.<ext>` for active resume artifacts.

## Maintenance Workflow
1. Update only `current/*.md` first.
2. Sync `.txt` and `.html` after each substantive update.
3. For major revisions, archive previous `current` version under `archive/` with date in filename.
4. Keep README link pointed to the latest current resume.

## Suggested Next Improvements
- Add a small script to auto-generate `.txt/.html/.pdf` from `.md`.
- Add a lint/check step for contact links and spelling.
- Maintain two profile variants in `current/`:
  - `banking-focused`
  - `ai-platform-focused`
